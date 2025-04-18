const express = require("express");
const app = express();
const port = 3004;

app.get("/ship", (req, res) => {
  setTimeout(() => {
    res.status(408).send("Request Timeout");
  }, 3000); // Simulate a slow response
});

app.listen(port, () => {
  console.log(`Shipping service running at http://localhost:${port}`);
});
