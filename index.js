import React from "react";
import { AppRegistry, StyleSheet, Text, View, Button } from "react-native";
import { NativeModules } from "react-native";

const HelloWorld = () => {
  const { CustomModule } = NativeModules;
  const onPress = () => {
    CustomModule.sendMessage("Mihai", "Salut cumetre");
  };

  return (
    <View style={styles.container}>
      <Text style={styles.hello}>Hello, Worldddd</Text>
      <Button title="Press Me To Call Native Function" onPress={onPress} />
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
