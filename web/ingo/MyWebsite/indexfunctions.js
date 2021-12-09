
function toCelsius(f) {
    return (f - 32) * (5 / 9);
};
// Fahrenheit in Celsius umwandeln mit function ... !!

function toFahrenheit() {
    return (c * 9 / 5) + 32;
};
// Grad Celsius in Fahrenheit umwandeln mit function ... !!

var myTemp = toFahrenheit(37.7);

console.log("My temp in F is ", myTemp, "degree");