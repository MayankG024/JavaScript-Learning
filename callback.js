function square(n) {
  return n * n;
}

function sumofnums(a, b, callback) {
  let sq1 = callback(a);
  let sq2 = callback(b);
  return sq1 + sq2;
}
let ans = sumofnums(2, 3, square);
console.log(ans);
