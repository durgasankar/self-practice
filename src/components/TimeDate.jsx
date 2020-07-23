// // import React from 'react'

// // function TimeDate() {

// //     const element = (
// //         <div>time: { new Date().toLocaleTimeString()}</div>
// //     );

// //     setInterval(element,1000);
// //     return (
// //         <div>
// //             {element}
// //         </div>
// //     )
// // }
// // export default TimeDate

// import React, { Component } from 'react'

// class TimeDate extends Component {

//     intervalSetting() {
//         setInterval(() => this.setState(
//             { curTime: new Date().toLocaleTimeString() }
//         ), 1000)
//     }

//     state = { curTime: new Date().toLocaleTimeString() }
//     render() {
//         return (
//             <div>
//                 Time: {this.state.curTime}
//             </div>
//         )
//     }
// }

// export default TimeDate
