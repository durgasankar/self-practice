import React from 'react';
import './App.css';
// import { Welcome } from './components/demo';
import Greet from './components/demo';
import Welcome from './components/Welcome';

function App() {
  return (
    <div className="App">
     <Welcome />
     2nd component
     <Greet /> 
     3rd Component
     <Welcome />
    </div>
  );
}

export default App;
