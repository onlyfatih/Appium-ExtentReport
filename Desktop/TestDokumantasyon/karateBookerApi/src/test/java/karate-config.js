function fn() {

  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) {
    env = 'dev';
  }

  // 'config' değişkeni, senaryoda kullanılacak ortam ve değişkenleri içerir
  var config = {
    env: env,
    myVarName: 'someValue',
    baseUrl: 'https://restful-booker.herokuapp.com/'
  }

  // 'karate.callSingle()' ile başka bir senaryodan ('createTokenCaller.feature') bir senaryo çağrılır
  // 'config' değişkeni bu senaryoya parametre olarak iletilir ve sonucu 'generalTokenResult' değişkenine atanır
  var generalTokenResult = karate.callSingle('classpath:caller/generateToken/createTokenCaller.feature@create_token_caller',config);
  config.generalToken = generalTokenResult.response.token;

  // 'karate.configure()' ile HTTP başlık bilgileri ayarlanır
  // 'Content-Type' ve 'Accept' başlıkları tanımlanır, 'Cookie' başlığı 'generalToken' ile oluşturulur
  karate.configure('headers', {
  'Content-Type': 'application/json',
  'Accept': 'application/json',
  'Cookie': 'token=' + config.generalToken
  });

  return config;
}