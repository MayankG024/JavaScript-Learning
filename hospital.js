const express = require('express');
const app = express();


const users = [{
    name: "don",    
    kidneys: [{
        healthy: true,
    }]
     
}];
app.get("/", (req, res) => {

    const johnkidneys = users[0].kidneys;
    const noofkidneys = johnkidneys.length;

    console.log(johnkidneys);
    console.log(noofkidneys);
});



app.listen(5000);