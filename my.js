const fs = require("fs");
fs.readFile("a.txt", "utf-8", function (err, data) {
  console.log(data);
});
function myFunction() {
  console.log("This is learning and building stage");
  // Do something
}
return myFunction();
