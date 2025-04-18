const express = require("express");
const app = express();
const port = 3001;

let failedAttempts = 0;
let state = "Closed";

// Circuit Breaker logic
app.post("/pay", (req, res) => {
  if (state === "Open") {
    return res.status(503).send("Circuit Breaker is open!");
  }
  
  if (failedAttempts >= 5) {
    state = "Open";
    setTimeout(() => { state = "HalfOpen"; }, 10000);  // reset after 10s
  }
  
  // Simulate a random failure or success
  const success = Math.random() > 0.5;
  if (success) {
    failedAttempts = 0;  // reset on success
    return res.status(200).send("Payment successful!");
  } else {
    failedAttempts++;
    return res.status(500).send("Payment failed!");
  }
});

app.listen(port, () => {
  console.log(`Payment service running at http://localhost:${port}`);
});
