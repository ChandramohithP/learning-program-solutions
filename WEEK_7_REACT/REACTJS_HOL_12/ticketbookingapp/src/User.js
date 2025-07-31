import React from 'react';

function User(props) {
  return (
    <div>
      <h2>Welcome back</h2>
      <p>You are now logged in. You can book tickets.</p>
      <button onClick={props.onLogout}>Logout</button>
    </div>
  );
}

export default User;
