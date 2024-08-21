const statement="hello, i love GFG..";
const vowels="aeiou";

// for(let i=0;i<statement.length;i++){
//     for(let j=0;j<vowels.length;j++){
//         if(statement.charAt(i)==vowels.charAt(j)){
//             console.log(`statement has ${vowels.charAt(j)}`);
//         }
//     }
// }
for(let i=0;i<statement.length;i++){
        if(vowels.includes(statement[i])){
            console.log(`${statement[i]} is a vowel`);
        }
}