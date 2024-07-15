const numbers = [65, 44, 12, 4];
const newArr =[ ];

function filterArray(n)
{
    if (n%2 == 0) {
        return true;
    }
    else{
        return false;
    }
};

const ans = numbers.filter(filterArray);
console.log(ans);
