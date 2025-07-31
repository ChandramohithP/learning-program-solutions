import React, { Component } from 'react';
import Guest from './Guest';
import User from './User';
class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: false
    };
  }

  handleLogin = () => {
    this.setState({ isLoggedIn: true });
  };

  handleLogout = () => {
    this.setState({ isLoggedIn: false });
  };

  render() {
    let content;

    if (this.state.isLoggedIn) {
      content = <User onLogout={this.handleLogout} />;
    } else {
      content = <Guest onLogin={this.handleLogin} />;
    }

    return (
      <div style={{ padding: '20px', fontFamily: 'Arial' }}>
        <h1>Ticket Booking Application</h1>
        {content}
      </div>
    );
  }
}

export default App;
