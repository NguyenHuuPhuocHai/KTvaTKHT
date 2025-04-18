const express = require("express");
const axios = require("axios");
const app = express();
const port = 3000;

app.use(express.json());

app.post("/pay", async (req, res) => {
  try {
    const response = await axios.post("http://localhost:3001/pay", req.body);
    res.status(response.status).send(response.data);
  } catch (error) {
    res.status(500).send("Error connecting to payment service");
  }
});

app.listen(port, () => {
  console.log(`API Gateway running at http://localhost:${port}`);
});
