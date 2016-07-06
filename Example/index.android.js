/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import CheckCamera from 'react-native-check-camera'
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';

class Example extends Component {
  render() {
    return (
      <View style={styles.container}>
        <Text onPress={this.test} style={styles.welcome}>
          Welcome to React Native!
        </Text>
      </View>
    );
  }
  test = () => {
    CheckCamera.checkAuthorization(result => console.log('result: ', result))
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});

AppRegistry.registerComponent('Example', () => Example);
