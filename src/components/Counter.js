import React, { Component } from 'react'

class Counter extends Component {

    constructor(props) {
        super(props)
        // calls to set state is Asynchronous
        this.state = {
            count: 0
        }
    }
    // the set state method has one call back function which will fetch the value after increment
    // if we pass the object then what many times the call back function may be it will be considered as one time.
    // Alternate for this is we need to pass a arrow function 
    increaseCount() {
        // this.setState({
        //     count: this.state.count + 1
        // }, () => {
        //     console.log("call back value : ", this.state.count);
        // })

        // also props we can do and prev state as parameter
        this.setState((prevState, props) => ({
            count: prevState.count + 1
        }))
        // out side set state method
        console.log("Without call back function : ", this.state.count);
    }

    incrementFive() {
        this.increaseCount();
        this.increaseCount();
        this.increaseCount();
        this.increaseCount();
        this.increaseCount();
    }

    render() {
        return (
            <div>
                <div>Count : {this.state.count}</div>
                <button onClick={() => this.incrementFive()}>Increase</button>
            </div>
        )
    }
}

export default Counter
