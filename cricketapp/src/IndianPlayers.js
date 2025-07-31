import React from 'react';
const IndianPlayers = () => {
  const oddTeam = ['Dhoni', 'Kohli', 'Jadeja', 'Ashwin', 'Shami'];
  const evenTeam = ['Rohit', 'Raina', 'Rahane', 'Bumrah', 'Siraj'];
  const [p1, p2, p3, p4, p5] = oddTeam;
  const [q1, q2, q3, q4, q5] = evenTeam;
  const T20players = ['Surya', 'Gill'];
  const RanjiPlayers = ['Pujara', 'Iyer'];
  const mergedPlayers = [...T20players, ...RanjiPlayers];
  return (
    <div>
      <h2>Odd Team</h2>
      <ul>
        <li>{p1}</li>
        <li>{p2}</li>
        <li>{p3}</li>
        <li>{p4}</li>
        <li>{p5}</li>
      </ul>

      <h2>Even Team </h2>
      <ul>
        <li>{q1}</li>
        <li>{q2}</li>
        <li>{q3}</li>
        <li>{q4}</li>
        <li>{q5}</li>
      </ul>

      <h2>List of Indian Players Merged</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
