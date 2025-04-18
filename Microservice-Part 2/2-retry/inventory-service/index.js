const express = require("express");
const app = express();
const port = 3002;

let attempt = 0;

app.get("/check", (req, res) => {
  attempt++;
  if (attempt < 5) {
    return res.status(500).send("Service Unavailable, retrying...");
  }
  res.status(200).send("Service is now available.");
});

app.listen(port, () => {
  console.log(`Inventory service running at http://localhost:${port}`);
});
