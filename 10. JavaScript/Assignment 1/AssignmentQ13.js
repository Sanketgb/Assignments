function sum(arr) { 
    let sum = 0; 

    for (let i = 0; i < arr.length; i++) 
        sum += arr[i]; 
    return sum; 
} 


function sum1(arr){
    let sum=0, i=0;
    while(i<arr.length){
        sum+=arr[i];
        i++;
    }
    return sum;
}
 
function sum2(arr){
    let sum=0, i=0;
    do{
        sum+=arr[i];
        i++;
    }while(i<arr.length);
    return sum;
}


let arr = [12, 3, 4, 15];
document.write("Sum of given array using fun1 is " + sum(arr)+"<br>");
document.write("Sum of given array using fun2 is " + sum1(arr)+"<br>");
document.write("Sum of given array using fun3 is " + sum2(arr)+"<br>");