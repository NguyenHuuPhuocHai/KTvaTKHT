const express = require("express");
const axios = require("axios");
const app = express();
const port = 3000;

app.use(express.json());

app.get("/ship", async (req, res) => {
  try {
    const response = await axios.get("http://localhost:3004/ship", { timeout: 2000 });
    res.status(response.status).send(response.data);
  } catch (error) {
    res.status(500).send("Request Timeout");
  }
});

app.listen(port, () => {
  console.log(`API Gateway running at http://localhost:${port}`);
});
