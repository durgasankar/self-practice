import React, { Component } from 'react'

class UserGreeting extends Component {
    constructor(props) {
        super(props)

        this.state = {
            isLoggedIn: true
        }
    }

    // by using if-else condition (not recommended)

    // render() {
    //     if (this.state.isLoggedIn) {
    //         return (
    //             <div>
    //                 <h1>Welcome Durgasankar</h1>
    //             </div>
    //         )
    //     } else {
    //         return (
    //             <div>
    //                 <h1>Welcome Guest</h1>
    //             </div>
    //         )
    //     }
    // }

    // js element Variable approach
    // render() {
    //     let message; // store the variable to display
    //     if (this.state.isLoggedIn) {
    //         message = <div>Welcome Durgasankar</div>
    //     } else {
    //         message = <div>Welcome Guest</div>
    //     }
    //     return <div>{message}</div>
    // }

    // ternary conditional operator (recomended) as we can use this in HTML
    // render() {
    //     return (
    //         this.state.isLoggedIn ?
    //             (<div>Welcome Durgasankar</div>) :
    //             (<div>Welcome Guest</div>)
    //     )
    // }

    // Short Circuit Operator Approach (when we return something or nothing)**

    render(){
        // when condition is true it proceed forward else dont render anything
        return this.state.isLoggedIn && <div>Welcome Durgasankar</div>
    }

}

export default UserGreeting
