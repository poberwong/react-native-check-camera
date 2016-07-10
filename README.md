# react-native-check-camera (only for Android)
to check whether camera-permission is denied by user

## Description
Generally speaking, we can't get to know whether camera-permission is denied with API support by Google and this library will achieve it, Maybe it could work for you.

## Installation

1. `npm install react-native-check-camera` 
2. `rnpm link react-native-check-camera`

## Usage

```
import CheckCamera from 'react-native-check-camera'

CheckCamera.checkAuthorization(result => console.log('result: ', result))
```

## License
*MIT*


