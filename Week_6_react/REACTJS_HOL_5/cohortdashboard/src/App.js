// src/App.js

import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div className="App">
      <h2>Cohort Dashboard</h2>
      <CohortDetails name="React Batch 1" trainer="Sundar" status="ongoing" />
      <CohortDetails name="Spring Boot Batch 2" trainer="Priya" status="completed" />
    </div>
  );
}

export default App;
