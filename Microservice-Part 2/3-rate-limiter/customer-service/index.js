const express = require("express");
const rateLimit = require("express-rate-limit");
const app = express();
const port = 3003;

// Rate limiter configuration
const limiter = rateLimit({
  windowMs: 60 * 1000, // 1 minute window
  max: 5, // Limit each IP to 5 requests per windowMs
  message: "Too many requests, please try again later."
});

app.use(limiter);

app.get("/info", (req, res) => {
  res.status(200).send("Customer service is running.");
});

app.listen(port, () => {
  console.log(`Customer service running at http://localhost:${port}`);
});
