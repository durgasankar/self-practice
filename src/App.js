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
     <Welcome name="Ramesh"/>
     <Welcome name="Suresh"/>
     4th component
     <WithoutJsxExample />
     5th component
     <JsxExample name="Duragasankar Mishra" tech="reactjs"/> 
     6th component
     <JsxExample name="Rupesh Patil" tech="nodejs"/> 
     7th component
     <JsxExample name="Sudeep Khatiar" tech="java"/>
    </div>
  );
}

export default App;
