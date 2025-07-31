import React from 'react';

function Guest(props) {
  return (
    <div>
      <h2>Please sign up</h2>
      <p>You can browse flight details, but booking is available only for logged in users.</p>
      <button onClick={props.onLogin}>Login</button>
    </div>
  );
}

export default Guest;
