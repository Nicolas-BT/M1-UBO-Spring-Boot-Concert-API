const Home ={
    template: '#home',
    name: 'Home'
}
const Groupes ={
    template: '<h1>Groupes</h1>',
    name: 'Groupes'
}
const Salles ={
    template: '<h1>Salles</h1>',
    name: 'Salles'
}
const Concerts ={
    template: '<h1>Concerts</h1>',
    name: 'Concerts'
}
const Soiree ={
    template: '<h1>Soiree</h1>',
    name: 'Soiree'
}

const router = new VueRouter({
    routes :[
        {path : '/', component : Home, name: Home},
        {path : '/Groupes', component : Groupes, name : 'Groupes'},
        {path : '/Salles', component : Salles, name: 'Salles'},
        {path : '/Concerts', component : Concerts, name : 'Concerts'},
        {path : '/Soiree', component : Soiree, name: 'Soiree'},
    ]
})




const app = Vue.createApp(g).mount('#app')