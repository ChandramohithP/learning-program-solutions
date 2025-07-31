import React, { Component } from 'react';

class Counter extends Component {
  constructor() {
    super();
    this.state = {
      count: 0
    };
    this.increment = this.increment.bind(this);
    this.sayHello = this.sayHello.bind(this);
  }

  increment() {
    this.setState({ count: this.state.count + 1 });
  }

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  sayHello() {
    alert('Hello! This is a static message.');
  }

  increaseAndSayHello = () => {
    this.increment();
    this.sayHello();
  };

  render() {
    return (
      <div>
        <h2>Counter</h2>
        <p>Current Value: {this.state.count}</p>
        <button onClick={this.increaseAndSayHello}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
      </div>
    );
  }
}

export default Counter;
