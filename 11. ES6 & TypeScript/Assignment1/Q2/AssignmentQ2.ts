function test(love){
    if (love){
      let fname = "Sanket";     //block level variable.
      const lname="Bolamwar";   //block level variable.
      console.log(`${fname} ${lname} your love is true.`); //Tried to Accessing variable in the block.
    }
    console.log(`${fname} ${lname} your love is not true.`); // Tried to Access variable out the block , throughs error.
}

test(true);
test(false);