import React from 'react';
import './App.css';
// import { Welcome } from './components/demo';
import Greet from './components/demo';
import Welcome from './components/Welcome';
import JsxExample from './components/Hallo';
import { WithoutJsxExample } from './components/Hallo';

function App() {
  return (
    <div className="App">
     <Welcome />
     2nd component
     <Greet /> 
     3rd Component
     <Welcome />
     4th component
     <JsxExample />
     5th component
     <WithoutJsxExample />
    </div>
  );
}

export default App;
