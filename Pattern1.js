/*
    Pattern I
    *
    * *
    * * *
    * * * *
    * * * * *
*/
const n=5;
const symbol="* ";
for(let i=1;i<=n;i++){
        console.log(symbol.repeat(i));
}

/*  
    Pattern II
    * * * * *
    * * * * 
    * * * 
    * * 
    * 
*/
console.log("--------------")
for(let i=n;i>0;i--){
    console.log(symbol.repeat(i));
}
console.log("--------------")
/*
    Pattern III
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * *
    * * * 
    * *  
    *  
*/
for(let i=1;i<=n;i++){
    console.log(symbol.repeat(i));
}
for(let i=n-1;i>0;i--){
    console.log(symbol.repeat(i));
}