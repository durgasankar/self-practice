import React, { Component } from 'react'

class EventHandler extends Component {

    constructor(props) {
        super(props)

        this.state = {
            message: 'Hallo'
        }
        this.eventHandlerFunction = this.eventHandlerFunction.bind(this);
    }
    // this key word is undefinded in event handler so binding is required
    // eventHandlerFunction() {
    //     console.log("Event Handler is called...", this);

    // }

    // approach 1
    // By using bind key word 
    eventHandlerFunction() {
        console.log("Event Handler is called...");
        this.setState({
            message: "Good Bye"
        })
    }

    // apprach 1 binding by using bind key word
    // render() {
    //     return (
    //         <div>
    //             {/* Here its is not a call back function in event handling */}
    //             <div>{this.state.message}</div>
    //             {/* by using bind key word we can bind data and this will render the data again and again so it is not recommended */}
    //             <button onClick={this.eventHandlerFunction.bind(this)}>Click me</button>
    //         </div>
    //     )
    // }

    // approach 2
    // By using arroaw function
    //  not recommended as per performance problem
    // render() {
    //     return (
    //         <div>
    //             {/* Here its is not a call back function in event handling */}
    //             <div>{this.state.message}</div>
    //             {/* by using bind key word we can bind data and this will render the data again and again so it is not recommended */}
    //             <button onClick={() => this.eventHandlerFunction()}>Click me</button>
    //         </div>
    //     )
    // }

    // approach 3 recommended in official docs
    // binding the handler in constructor

    // approach 4 binding in a arrow function
    eventHandlerFunction = () => {
        this.setState({
            message: "Good Bye!"
        })
    }

    render() {
        return (
            <div>
                <div>{this.state.message}</div>
                <button onClick={this.eventHandlerFunction}>Click me</button>
            </div>
        )
    }
}

export default EventHandler
