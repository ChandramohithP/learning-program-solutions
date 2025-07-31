import React from 'react';

function Welcome() {
  const showWelcome = (msg) => {
    alert(`Welcome message: ${msg}`);
  };

  return (
    <div>
      <h2>Say Welcome</h2>
      <button onClick={() => showWelcome('Welcome to React Event World!')}>
        Say Welcome
      </button>
    </div>
  );
}

export default Welcome;
