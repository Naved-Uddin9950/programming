# Ribald

Ribald is a lightweight and efficient Node.js package designed for detecting vulgar and obscene words within strings. It provides a comprehensive list of offensive terms, allowing developers to filter and moderate user-generated content effectively.

## Installation

Install Ribald via npm:

npm install ribald


## Usage

Import Ribald into your Node.js application:

```javascript :``` <br><br>
```import ribald from "ribald";```

```let input = "This is a test string containing vulgar words like fuck, asshole, and slut.";```

```let detectedWords = ribald(input);```

```console.log(detectedWords);```

This will output an array containing all detected vulgar words from the input string.


## Example

```import ribald from "ribald";```

```let input = "This is a test string containing vulgar words like fuck, asshole, and slut.";```

```let detectedWords = ribald(input);```

```console.log(detectedWords);```

// Output: ["fuck", "asshole", "slut"]


## List of Words

The package includes a predefined list of vulgar words such as:

 - Fuck
 - Shit
 - Asshole
 - Bitch
 - Cunt
 - ...


## Contributing

Contributions to the list of vulgar words or improvements to the package are welcome. Please open an issue or submit a pull request on <a href="https://github.com/Naved-Uddin9950/programming/tree/main/Web%20Dev/Projects/Packages/ribald">GitHub</a>

## License

This package is licensed under the <a href="https://en.wikipedia.org/wiki/ISC_license">ISC</a> License.

<hr>

This package is intended for educational and informational purposes only. Use it responsibly and in accordance with applicable laws and regulations.

