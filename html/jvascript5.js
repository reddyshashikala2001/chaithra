let n = 10, a = 0, b = 1;
for (let i = 0; i < n; i++) {
    console.log(a);
    [a, b] = [b, a + b];
}
