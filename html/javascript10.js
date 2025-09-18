let secret = Math.floor(Math.random() * 10) + 1;
let guess = 7; // Example guess
if (guess === secret) {
    console.log("Correct! 🎉");
} else {
    console.log("Wrong! The number was " + secret);
}
