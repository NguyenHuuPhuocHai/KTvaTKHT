const express = require("express");
const axios = require("axios");
const app = express();
const port = 3000;

app.use(express.json());

app.get("/info", async (req, res) => {
  try {
    const response = await axios.get("http://localhost:3003/info");
    res.status(response.status).send(response.data);
  } catch (error) {
    res.status(500).send("Error connecting to customer service");
  }
});

app.listen(port, () => {
  console.log(`API Gateway running at http://localhost:${port}`);
});
