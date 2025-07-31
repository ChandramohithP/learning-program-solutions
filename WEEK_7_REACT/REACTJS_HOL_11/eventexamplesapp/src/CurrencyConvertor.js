import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState('');

  const handleSubmit = () => {
    const result = parseFloat(rupees) * 0.011; 
    const formatted = result.toFixed(2);
    setEuros(formatted);

    alert(`Euro Value is: €${formatted}`);
  };

  return (
    <div>
      <h2>Currency Convertor</h2>
      <label>
        Indian Rupees:
        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
        />
      </label>
      <button onClick={handleSubmit}>Convert</button>

      {euros && <p>Euro Value: €{euros}</p>}
    </div>
  );
}

export default CurrencyConvertor;
