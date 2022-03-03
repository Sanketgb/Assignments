alert("hello world");
document.write("hi thier this is js note");
console.log("this is console msg");


var myCar = new Object();
myCar.maxSpeed=50;
myCar.driver="petter";
myCar.drive=function(){console.log("now driving");};

console.log(myCar.maxSpeed);
console.log(myCar.driver);
myCar.drive();


var myCar2= {
    maxSpeed:70, 
    driver: "madan", 
    drive:function(speed, time ){
        console.log("driving speed is ",speed*time);
    }
};

console.log(myCar2.maxSpeed);
console.log(myCar2.driver);
myCar2.drive(50,3);

var myDate = new Date();
console.log(myDate);