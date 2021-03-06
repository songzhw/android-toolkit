#!/usr/bin/env node
const { getApi } = require("./api_lvl");

const argv = require("yargs")
  .alias("a", "api")  // search api levels
  .argv;
const api = argv.api;

if (api) {
  getApi(api);
}


/*
 src/mtools.js --name=tom --id=23 -h=true (参数单字母用-, 多字母用--开头!!!)
 argv的结果就是:  { _: [], name: 'tom', id: 23, h: 'true', '$0': 'src/mtools.js' }
 */

