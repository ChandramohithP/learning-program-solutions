// import React from 'react';
// import BookDetails from './BookDetails';
// import BlogDetails from './BlogDetails';
// import CourseDetails from './CourseDetails';
// function App() {
//   return (
//     <div style={{ padding: '30px', fontFamily: 'Arial' }}>
//       <h1 style={{ textAlign: 'center' }}>Blogger Application</h1>

//       <div
//         style={{
//           display: 'flex',
//           justifyContent: 'space-around',
//           marginTop: '40px',
//         }}
//       >
//         <div style={{ borderRight: '4px solid green', paddingRight: '40px' }}>
//           <CourseDetails />
//         </div>

//         <div style={{ borderRight: '4px solid green', padding: '0 40px' }}>
//           <BookDetails />
//         </div>

//         <div style={{ paddingLeft: '40px' }}>
//           <BlogDetails />
//         </div>
//       </div>
//     </div>
//   );
// }

// export default App;
import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [selectedComponent, setSelectedComponent] = useState('books');

  const renderComponent = () => {
    if (selectedComponent === 'books') {
      return <BookDetails />;
    } else if (selectedComponent === 'blogs') {
      return <BlogDetails />;
    } else if (selectedComponent === 'courses') {
      return <CourseDetails />;
    } else {
      return <p>Please select a category</p>;
    }
  };

  return (
    <div style={{ padding: '30px', fontFamily: 'Arial' }}>
      <h1>Blogger Application</h1>
      
      <div style={{ marginBottom: '20px' }}>
        <button onClick={() => setSelectedComponent('books')}>Book Details</button>
        <button onClick={() => setSelectedComponent('blogs')}>Blog Details</button>
        <button onClick={() => setSelectedComponent('courses')}>Course Details</button>
      </div>

      <hr />
      {renderComponent()}
    </div>
  );
}

export default App;
