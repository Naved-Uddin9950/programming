# Changelog

All notable changes to this project will be documented in this file.

## [1.1.0] - 2024-03-16

### Added

- Added support for detecting Hinglish cuss/vulgar words.
- Updated the list of vulgar words with Hinglish terms.

### Changed

- Updated the response format to return a JSON object containing the original input, detected vulgar words, word count, and a filtered version of the input with vulgar words replaced by asterisks.

### Removed

- None.

## [1.0.1] - 2024-03-14

### Fixed

- Fixed a bug where the detection algorithm was not correctly identifying vulgar words.


## [1.0.0] - 2024-03-05

### Added

- Initial release of Ribald.
- Detection algorithm to identify vulgar words within strings.
- Predefined list of offensive terms for filtering.
