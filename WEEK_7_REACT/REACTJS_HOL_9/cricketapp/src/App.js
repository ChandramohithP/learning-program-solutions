import React from 'react';
import ListOfPlayers from './ListOfPlayers';
import IndianPlayers from './IndianPlayers';
const App = () => {
  const flag = false;
  return (
    <div className="App">
      <h1>Cricket Team Dashboard</h1>
      {flag ? <ListOfPlayers /> : <IndianPlayers />}
    </div>
  );
};

export default App;
