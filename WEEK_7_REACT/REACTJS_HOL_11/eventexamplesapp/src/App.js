import React from 'react';
import Counter from './Counter';
import Welcome from './Welcome';
import SyntheticEvent from './SyntheticEvent';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  return (
    <div style={{ padding: '30px', fontFamily: 'Arial' }}>
      <h1>React Event Examples</h1>
      <Counter />
      <Welcome />
      <SyntheticEvent />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
