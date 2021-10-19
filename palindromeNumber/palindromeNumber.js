/**
 * Given an integer x, return true if x is palindrome integer.

 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

 * @param {number} x
 * @return {boolean}
 */
const isPalindrome = x => {
    // Negative numbers are not palindromes, so if x is a palindrome, immediately return false
    if(x < 0) {
        return false;
    }
    // Convert x into a string
    let newX = x.toString();
    // Use the split function, which splits each character separately and places it in an array
    let reversedX = newX.split('');
    // Create an empty string, which will be used to store the result
    result = '';
    // Iterate through the new x array backwards, inserting each character into the 'result' variable's value
    for(let i = reversedX.length - 1; i >= 0; i--) {
        result += reversedX[i];
    }
    // If the result is the same as x, return true because then it is a palindrome
    // Else, return false because it is not a palindrome
    return newX === result;
}

// Returns false because it is a negative number
console.log(isPalindrome(-121));

// Returns true because it is a positive number and 121 backwards is 121, so it is a palindrome number
console.log(isPalindrome(121));