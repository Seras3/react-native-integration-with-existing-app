import React from "react";
import { AppRegistry, StyleSheet, Text, View, Button } from "react-native";
import { NativeModules } from "react-native";

const HelloWorld = () => {
  const { SuccessErrorModule } = NativeModules;

  return (
    <View style={styles.container}>
      <Text style={styles.hello}>Hello, Worldddd</Text>
      <Button
        title="Press To Call Success"
        color="green"
        onPress={() => {
          SuccessErrorModule.finish(true);
        }}
      />
      <Button
        title="Press To Send Error"
        color="red"
        onPress={() => {
          SuccessErrorModule.sendError("Error from React-Native");
        }}
      />
    </View>
  );
};
var styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
  },
  hello: {
    fontSize: 20,
    textAlign: "center",
    margin: 10,
  },
});

AppRegistry.registerComponent("CrossPlatformAppV65", () => HelloWorld);
