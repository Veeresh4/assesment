function reverseWordsInSentence(sentence) {
    const words = sentence.split(/\s+/);
    const reversedWords = words.map(word => {
        const reversedWord = word.split('').reverse().join('');
        return reversedWord;
    });
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}
const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log("Reversed sentence:", reversedSentence);
