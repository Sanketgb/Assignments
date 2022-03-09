function test(love) {
    if (love) {
        var fname = "Sanket"; //block level variable.
        var lname = "Bolamwar"; //block level variable.
        console.log("".concat(fname, " ").concat(lname, " your love is true.")); //Tried to Accessing variable in the block.
    }
    console.log("".concat(fname, " ").concat(lname, " your love is not true.")); // Tried to Access variable out the block , throughs error.
}
test(true);
test(false);
