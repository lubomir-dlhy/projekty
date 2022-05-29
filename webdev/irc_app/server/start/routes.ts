/*
|--------------------------------------------------------------------------
| Routes
|--------------------------------------------------------------------------
|
| This file is dedicated for defining HTTP routes. A single file is enough
| for majority of projects, however you can define routes in different
| files and just make sure to import them inside this file. For example
|
| Define routes in following two files
| ├── start/routes/cart.ts
| ├── start/routes/customer.ts
|
| and then import them inside `start/routes.ts` as follows
|
| import './routes/cart'
| import './routes/customer'
|
*/

import Route from '@ioc:Adonis/Core/Route';

Route.group(() => {
  Route.post('register', 'AuthController.register');
  Route.post('login', 'AuthController.login');
  Route.post('logout', 'AuthController.logout').middleware('auth');
  Route.get('me', 'AuthController.me').middleware('auth');
}).prefix('auth');

Route.group(() => {
  Route.post('create', 'ChannelController.create');
  Route.post('joinOrCreate', 'ChannelController.joinOrCreate');
  Route.post('invite', 'ChannelController.invite');
  Route.post('revoke', 'ChannelController.revoke');
  Route.post('handleInvite', 'ChannelController.handleInvite');
  Route.post('kick', 'ChannelController.kick');
})
  .prefix('channel')
  .middleware('auth');
