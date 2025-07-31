import React from 'react';

const ListOfPlayers = () => {
  const players = [
    { name: 'Rohit Sharma', score: 85 },
    { name: 'Virat Kohli', score: 95 },
    { name: 'Gill', score: 45 },
    { name: 'Surya', score: 60 },
    { name: 'Hardik', score: 55 },
    { name: 'Rahul', score: 80 },
    { name: 'Shami', score: 67 },
    { name: 'Siraj', score: 70 },
    { name: 'Bumrah', score: 35 },
    { name: 'Jadeja', score: 92 },
    { name: 'Ashwin', score: 74 }
  ];

  const allPlayers = players.map(p => (
    <li key={p.name}>{p.name} - {p.score}</li>
  ));

  const lowScoringPlayers = players
    .filter(p => p.score < 70)
    .map(p => <li key={p.name}>{p.name} - {p.score}</li>);

  return (
    <div>
      <h2>All Players (map)</h2>
      <ul>{allPlayers}</ul>

      <h2>Low Scorers (score &lt; 70 using arrow function)</h2>
      <ul>{lowScoringPlayers}</ul>
    </div>
  );
};

export default ListOfPlayers;
