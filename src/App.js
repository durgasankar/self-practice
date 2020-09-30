import React, { Component } from 'react';
import './App.css';
// import { Welcome } from './components/demo';
import Greet from './components/demo';
import Welcome from './components/Welcome';
import JsxExample from './components/Hallo';
import { WithoutJsxExample } from './components/Hallo';
import StateExample from './components/state'
import Counter from './components/Counter';
import EventHandler from './components/EventHandler';
import ParentComponent from './components/ParentComponent';
import UserGreeting from './components/UserGreeting';
import NameList from './components/NameList';
import TimeDate from './components/TimeDate';
import Event from './components/Event';
import UserInput from './components/UserInput/UserInput';
import UserOutput from './components/UserOutput/UserOutput';

// // use of props
// function App() {
//   return (
//     <div className="App">
//       {/* <Counter /> */}
//       {/* <Welcome /> */}
//       {/* 2nd component */}
//       {/* <Greet />  */}
//       {/* 3rd Component */}
//       {/* <Welcome name="Ramesh"/> */}
//       {/* <Welcome name="Suresh"/> */}
//       {/* 4th component */}
//       {/* <WithoutJsxExample /> */}
//       {/* 5th component */}
//       {/* <JsxExample name="Duragasankar Mishra" tech="reactjs"/>  */}
//       {/* 6th component */}
//       {/* <JsxExample name="Rupesh Patil" tech="nodejs"/>  */}
//       {/* 7th component */}
//       {/* <JsxExample name="Sudeep Khatiar" tech="java"/> */}
//       {/* <StateExample /> */}
//       {/* <EventHandler /> */}
//       {/* <ParentComponent /> */}
//       {/* <UserGreeting /> */}
//       {/* <NameList /> */}
//       {/* <TimeDate /> */}
//       {/* <Event></Event> */}
//       <UserInput />
//       <UserOutput userName="Ramesh" />
//       <UserOutput userName="Suresh" />
//       <UserOutput userName="Kursi" />
//     </div>
//   );
// }

// export default App;


class App extends Component {
  state = {
    username: 'supermax'
  }

  usernameChangedHandler = (event) => {
this.setState({ username: event.target.value })
  }
  render() {
    return (
      <div className="App">
        <UserInput changed={this.usernameChangedHandler} currentName={this.state.username} />
        <UserOutput userName={this.state.username} />
        <UserOutput userName={this.state.username} />
        <UserOutput userName="Kursi" />
      </div>
    );
  }
}

export default App;