import React from 'react';

function App() {
  // 1. JSX Heading
  const heading = (
    <h1 style={{ textAlign: 'center' }}>
      Office Space Rental Portal
    </h1>
  );

  // 2. Image JSX (✅ Working Bing Image)
  const image = (
    <img
      src="https://tse2.mm.bing.net/th/id/OIP.aUy-Vdh35k-BuMALzhMEFwEyDM?pid=Api&P=0&h=180"
      alt="Office Space"
      style={{
        width: '600px',
        display: 'block',
        margin: '20px auto',
        borderRadius: '10px'
      }}
    />
  );

  // 3. Single office object
  const office = {
    name: 'Blue Tower Workspace',
    rent: 58000,
    address: 'Anna Nagar, Chennai'
  };

  // 4. List of office objects
  const officeList = [
    { name: 'Tech Park', rent: 50000, address: 'Tidel Park, Chennai' },
    { name: 'Startup Hub', rent: 75000, address: 'Koramangala, Bangalore' },
    { name: 'Creative Nest', rent: 62000, address: 'Hitech City, Hyderabad' },
    { name: 'Budget Bay', rent: 45000, address: 'Sector 5, Noida' }
  ];

  // 5. Single office block
  const singleOffice = (
    <div style={{ textAlign: 'center', marginTop: '20px' }}>
      <h2>{office.name}</h2>
      <p style={{ color: office.rent < 60000 ? 'red' : 'green', fontWeight: 'bold' }}>
        Rent: ₹{office.rent}
      </p>
      <p>Address: {office.address}</p>
    </div>
  );

  // 6. List of office JSX blocks
  const officeItems = officeList.map((item, index) => {
    const rentStyle = {
      color: item.rent < 60000 ? 'red' : 'green',
      fontWeight: 'bold'
    };

    return (
      <li key={index} style={{ marginBottom: '15px' }}>
        <strong>{item.name}</strong><br />
        Rent: <span style={rentStyle}>₹{item.rent}</span><br />
        Address: {item.address}
      </li>
    );
  });

  return (
    <div style={{ fontFamily: 'Arial, sans-serif', padding: '20px' }}>
      {heading}
      {image}
      {singleOffice}

      <h2 style={{ marginTop: '40px' }}>Available Office Spaces:</h2>
      <ul style={{ listStyleType: 'none', padding: 0 }}>
        {officeItems}
      </ul>
    </div>
  );
}

export default App;
