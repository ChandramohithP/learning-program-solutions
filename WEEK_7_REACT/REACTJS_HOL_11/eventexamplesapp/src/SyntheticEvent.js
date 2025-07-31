import React from 'react';

function SyntheticEvent() {
  const handleClick = (e) => {
    e.preventDefault(); 
    alert('I was clicked');
  };

  return (
    <div>
      <h2>Synthetic Event</h2>
      <button onClick={handleClick}>OnPress</button>
    </div>
  );
}

export default SyntheticEvent;
