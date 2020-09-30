import React, { Component } from 'react'

class Event extends Component {
    constructor(props) {
        super(props)
        this.state = {
            persons: [
                { name: 'Raja', age: 23 },
                { name: 'Ramesh', age: 26 },
                { name: 'Suresh', age: 28 }
            ],
            otherState: 'some value'
        }
    }

    clickMeHandler = () => {
        console.log("Was Clicked...");
        this.setState({
            persons: [
                { name: 'Durgasankar', age: 25 },
                { name: 'Rakesh', age: 30 },
                { name: 'Himesh', age: 21 }
            ]
        })
    }

    render(props) {
        return (
            <div>
                <button onClick={this.clickMeHandler}>Click Me</button>
                <h1>Hallo {this.state[0].name}, You are {this.state[0].age} years old</h1>
                <h1>Hallo {this.state[1].name}, You are {this.state[1].age} years old</h1>
                <h1>Hallo {this.state[2].name}, You are {this.state[2].age} years old</h1>
            </div>
        )
    }
}

export default Event
